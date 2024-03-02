/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.app3;

/**
 *
 * @author AYMEN ZITOUNI
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

class Compte {
    String username;
    String password;

    Compte(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class Acheteur extends Compte {
    ArrayList<Offre> offres;

    Acheteur(String username, String password) {
        super(username, password);
        this.offres = new ArrayList<>();
    }
}

class Vendeur extends Compte {
    ArrayList<Produit> produits;

    Vendeur(String username, String password) {
        super(username, password);
        this.produits = new ArrayList<>();
    }

    void ajouterProduit(String nomProduit, double prixProduit, LocalDate dateExpiration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class Produit {
    String nom;
    double prix;
    LocalDate dateExpiration; //pour la dure de vante de produit

    Produit(String nom, double prix, LocalDate dateExpiration) {
        this.nom = nom;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }

    boolean estExpiré() {
        return LocalDate.now().isAfter(dateExpiration);
    }
}


class Offre {
    Produit produit;
    double prixPropose;//prix  par un acheter

    Offre(Produit produit, double prixPropose) {
        this.produit = produit;
        this.prixPropose = prixPropose;
    }
}

class Notification {
    String contenu;
    Acheteur acheteur;

    Notification(String contenu, Acheteur acheteur) {
        this.contenu = contenu;
        this.acheteur = acheteur;
    }
}

// Gestion des notifications
class GestionnaireNotifications {
    static ArrayList<Notification> notifications = new ArrayList<>();

    static void envoyerNotification(String contenu, Acheteur acheteur) {
        Notification notification = new Notification(contenu, acheteur);
        notifications.add(notification);
    }

    static void afficherNotifications() {
        System.out.println("-Notifications-");
        for (Notification notification : notifications) {
            System.out.println("Message : " + notification.contenu + ", Destinataire : " + notification.acheteur.username);
        }
        System.out.println("-----------------------");
    }
}





public class App3 {
    static ArrayList<Acheteur> acheteurs = new ArrayList<>();
    static ArrayList<Vendeur> vendeurs = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            afficherMenuPrincipal();
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    creerCompteAcheteur();
                    break;
                case "2":
                    Acheteur acheteur = loginAcheteur();
                    if (acheteur != null) {
                        menuAcheteur(acheteur);
                    }
                    break;
                case "3":
                    creerCompteVendeur();
                    break;
                case "4":
                    Vendeur vendeur = loginVendeur();
                    if (vendeur != null) {
                        menuVendeur(vendeur);
                    }
                    break;
                case "5":
                    System.out.println("Au revoir !");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }

    static void afficherMenuPrincipal() {
        System.out.println("Menu principal :");
        System.out.println("1- Créer un compte acheteur");
        System.out.println("2- Se connecter à un compte acheteur");
        System.out.println("3- Créer un compte vendeur");
        System.out.println("4- Se connecter à un compte vendeur");
        System.out.println("5- Quitter");
        System.out.print("Choix : ");
    }

    static void creerCompteAcheteur() {
        System.out.print("Entrez votre nom d'utilisateur : ");
        String username = scanner.nextLine();
        System.out.print("Entrez votre mot de passe : ");
        String password = scanner.nextLine();
        acheteurs.add(new Acheteur(username, password));
        System.out.println("Compte acheteur créé avec succès.");
    }

    static Acheteur loginAcheteur() {
        System.out.print("Nom d'utilisateur : ");
        String username = scanner.nextLine();
        System.out.print("Mot de passe : ");
        String password = scanner.nextLine();
        for (Acheteur acheteur : acheteurs) {
            if (acheteur.username.equals(username) && acheteur.password.equals(password)) {
                return acheteur;
            }
        }
        System.out.println("Compte invalide.");
        return null;
    }

    static void menuAcheteur(Acheteur acheteur) {
        while (true) {
            System.out.println("Menu acheteur :");
            System.out.println("1- Rechercher un produit");
            System.out.println("2- Consulter les articles disponibles");
            System.out.println("3- Faire une offre sur un produit");
            System.out.println("4- Revenir au menu principal");
            System.out.print("Choix : ");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    rechercherProduit();
                    break;
                case "2":
                    consulterArticles();
                    break;
                case "3":
                    faireOffre(acheteur);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }

    static void creerCompteVendeur() {
        System.out.print("Entrez votre nom d'utilisateur : ");
        String username = scanner.nextLine();
        System.out.print("Entrez votre mot de passe : ");
        String password = scanner.nextLine();
        vendeurs.add(new Vendeur(username, password));
        System.out.println("Compte vendeur créé avec succès.");
    }

    static Vendeur loginVendeur() {
        System.out.print("Nom d'utilisateur : ");
        String username = scanner.nextLine();
        System.out.print("Mot de passe : ");
        String password = scanner.nextLine();
        for (Vendeur vendeur : vendeurs) {
            if (vendeur.username.equals(username) && vendeur.password.equals(password)) {
                return vendeur;
            }
        }
        System.out.println("Compte invalide.");
        return null;
    }

    static void menuVendeur(Vendeur vendeur) {
        while (true) {
            System.out.println("Menu vendeur :");
            System.out.println("1- Ajouter un produit");
            System.out.println("2- Voir ma liste de produits");
            System.out.println("3- Supprimer un produit");
            System.out.println("4- Revenir au menu principal");
            System.out.print("Choix : ");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    ajouterProduit(vendeur);
                    break;
                case "2":
                    voirListeProduits(vendeur);
                    break;
                case "3":
                    supprimerProduit(vendeur);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
       static void ajouterProduit(Vendeur vendeur) {
    System.out.print("Entrez le nom du produit : ");
    String nomProduit = scanner.nextLine();
    System.out.print("Entrez le prix du produit : ");
    double prixProduit = scanner.nextDouble();
    scanner.nextLine(); 
    
    // le dure
    System.out.print("Entrez la date d'expiration du produit (AAAA-MM-JJ) : ");
    String dateExpirationString = scanner.nextLine();
    LocalDate dateExpiration = LocalDate.parse(dateExpirationString);
     try {
            dateExpiration = LocalDate.parse(dateExpirationString);
        } catch (DateTimeParseException e) {
            System.out.println("Format de date invalide. Utilisez le format AAAA-MM-JJ.");
            return; // Sortie de la méthode si la date est invalide
        }
    
    vendeur.produits.add(new Produit(nomProduit, prixProduit, dateExpiration));
    System.out.println("Produit ajouté avec succès.");
}


    static void voirListeProduits(Vendeur vendeur) {
        System.out.println("Liste des produits :");
        for (Produit produit : vendeur.produits) {
            System.out.println("Nom : " + produit.nom + ", Prix : " + produit.prix);
        }
    }

    static void supprimerProduit(Vendeur vendeur) {
        System.out.print("Entrez le nom du produit à supprimer : ");
        String nomProduit = scanner.nextLine();
        Produit produitASupprimer = null;
        for (Produit produit : vendeur.produits) {
            if (produit.nom.equals(nomProduit)) {
                produitASupprimer = produit;
                break;
            }
        }
        if (produitASupprimer != null) {
            vendeur.produits.remove(produitASupprimer);
            System.out.println("Produit supprimé avec succès.");
        } else {
            System.out.println("Produit non trouvé.");
        }
    }
    static void rechercherProduit() {
        System.out.print("Entrez le nom du produit à rechercher : ");
        String nomProduit = scanner.nextLine();
        boolean produitTrouve = false;
        for (Vendeur vendeur : vendeurs) {
            for (Produit produit : vendeur.produits) {
                if (produit.nom.equalsIgnoreCase(nomProduit)) {
                    produitTrouve = true;
                    System.out.println("Produit trouvé chez " + vendeur.username + " : Nom : " + produit.nom + ", Prix : " + produit.prix);
                }
            }
        }
        if (!produitTrouve) {
            System.out.println("Produit non trouvé.");
        }
    }

    static void consulterArticles() {
    System.out.println("Articles disponibles :");
    for (Vendeur vendeur : vendeurs) {
        for (Produit produit : vendeur.produits) {
            if (estProduitDisponible(produit)) {
                System.out.println("Vendeur : " + vendeur.username + ", Nom : " + produit.nom + ", Prix : " + produit.prix);
            }
        }
    }
}

static boolean estProduitDisponible(Produit produit) {
    for (Acheteur acheteur : acheteurs) {
        for (Offre offre : acheteur.offres) {
            if (offre.produit == produit) {
                return true; // Si une offre a déjà été faite sur ce produit
            }
        }
    }
    return true; // Si aucune offre n'a été faite sur ce produit, il est disponible
}


static void faireOffre(Acheteur acheteur) {
    System.out.print("Entrez le nom du produit sur lequel vous souhaitez faire une offre : ");
    String nomProduit = scanner.nextLine();
    Produit produitCible = null;
    for (Vendeur vendeur : vendeurs) {
        for (Produit produit : vendeur.produits) {
            if (produit.nom.equalsIgnoreCase(nomProduit)) {
                produitCible = produit;
                break;
            }
        }
        if (produitCible != null) {
            break;
        }
    }
    if (produitCible != null) {
        double prixMinimum = produitCible.prix; // Le prix minimum est le prix du vendeur
        for (Acheteur a : acheteurs) {
            for (Offre offre : a.offres) {
                if (offre.produit == produitCible && offre.prixPropose > prixMinimum) {
                    prixMinimum = offre.prixPropose; // Mettre à jour le prix minimum avec la dernière offre
                }
            }
        }
        System.out.print("Entrez votre offre pour " + produitCible.nom + " (supérieure à " + prixMinimum + ") : ");
        double offre = scanner.nextDouble();
        scanner.nextLine(); // Pour consommer la nouvelle ligne laissée par nextDouble()
        if (offre > prixMinimum && offre > produitCible.prix) {
            acheteur.offres.add(new Offre(produitCible, offre));
            produitCible.prix = offre; // Mettre à jour le prix du produit avec le nouveau prix proposé
            System.out.println("Offre faite avec succès.");
        } else {
            System.out.println("Votre offre doit être supérieure au prix du vendeur et à la dernière offre.");
        }
    } else {
        System.out.println("Produit non trouvé.");
    }
}

static void verifierDateExpirationProduits() {
    for (Vendeur vendeur : vendeurs) {
        for (Produit produit : vendeur.produits) {
            if (produit.estExpiré()) {
                notifierExpirationProduit(produit);
            }
        }
    }
}
static void notifierExpirationProduit(Produit produit) {
    System.out.println("La vente du produit " + produit.nom + " est terminée.");
}
  // Après avoir traité une offre et que l'achat est effectué avec succès
void notifierAcheteurOffreAcceptee(Acheteur acheteur, Produit produit) {
    String contenu = "Votre offre sur le produit '" + produit.nom + "' a été acceptée avec succès.";
    GestionnaireNotifications.envoyerNotification(contenu, acheteur);
}

}



