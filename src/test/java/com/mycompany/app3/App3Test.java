/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.app3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


/**
 *
 * @author AYMEN ZITOUNI
 */
public class App3Test {
    
    public App3Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class App3.
     */
     @Test
    public void testMain() {
        // Créer un PrintStream mocké pour simuler la sortie standard
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream mockPrintStream = new PrintStream(outContent);
        System.setOut(mockPrintStream);

        // Appeler la méthode main
        String[] args = null;
        App3.main(args);

        // Vérifier que la sortie standard contient le texte attendu
        String expectedOutput = "Votre application démarre...";
        assertEquals(expectedOutput, outContent.toString().trim());

        // Réinitialiser la sortie standard
        System.setOut(System.out);
    }
    /**
     * Test of afficherMenuPrincipal method, of class App3.
     */
      @Test
    public void testAfficherMenuPrincipal() {
        // Créer un PrintStream mocké pour simuler la sortie standard
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream mockPrintStream = new PrintStream(outContent);
        System.setOut(mockPrintStream);

        // Appeler la méthode afficherMenuPrincipal
        App3.afficherMenuPrincipal();

        // Vérifier que la sortie standard contient le texte attendu
        String expectedOutput = "Menu principal : ..."; // Remplacez par le texte attendu
        assertEquals(expectedOutput, outContent.toString().trim());

        // Réinitialiser la sortie standard
        System.setOut(System.out);
    }

    /**
     * Test of creerCompteAcheteur method, of class App3.
     */
  @Test
    public void testCreerCompteAcheteur() {
        // Créer un mock pour la classe App3
        App3 appMock = mock(App3.class);

        // Appeler la méthode creerCompteAcheteur
        appMock.creerCompteAcheteur();

        // Vérifier si la méthode creerCompteAcheteur a été appelée une fois
        verify(appMock, times(1)).creerCompteAcheteur();
    }

    /**
     * Test of loginAcheteur method, of class App3.
     */
        @Test
    public void testLoginAcheteur() {
        // Créer un mock pour la classe Acheteur
        Acheteur acheteurMock = mock(Acheteur.class);
        
        // Définir le comportement attendu du mock
        when(App3.loginAcheteur()).thenReturn(acheteurMock);
        
        // Appeler la méthode loginAcheteur
        Acheteur result = App3.loginAcheteur();
        
        // Vérifier si la méthode renvoie le mock attendu
        assertEquals(acheteurMock, result);
    }

    /**
     * Test of menuAcheteur method, of class App3.
     */
    @Test
    public void testMenuAcheteur() {
        // Créer un mock pour la classe Acheteur
        Acheteur acheteurMock = mock(Acheteur.class);
        
        // Appeler la méthode menuAcheteur avec le mock en argument
        App3.menuAcheteur(acheteurMock);
        
        // Vérifier si la méthode du mock a été appelée
       // verify(acheteurMock).menuAcheteur();
    }

    /**
     * Test of creerCompteVendeur method, of class App3.
     */
   @Test
public void testCreerCompteVendeur() {
    System.out.println("creerCompteVendeur");

    // Créer un mock de la classe Vendeur
    Vendeur vendeurMock = mock(Vendeur.class);

    // Créer un mock de la liste de vendeurs
    ArrayList<Vendeur> mockVendeurs = mock(ArrayList.class);

    // Injecter le mock de la liste de vendeurs dans l'application
    App3 app = new App3();
    app.vendeurs = mockVendeurs;

    // Simuler l'ajout du vendeur à la liste de vendeurs
    when(mockVendeurs.add(vendeurMock)).thenReturn(true);

    // Appel de la méthode creerCompteVendeur()
    app.creerCompteVendeur();

    // Vérifier si la méthode add a été appelée sur le mock de la liste de vendeurs avec le vendeur simulé
    verify(mockVendeurs).add(vendeurMock);
}

    /**
     * Test of loginVendeur method, of class App3.
     */

   @Test
public void testLoginVendeur() {
    System.out.println("loginVendeur");

    // Créer un mock de la classe Vendeur
    Vendeur vendeurMock = mock(Vendeur.class);

    // Créer un mock de la liste de vendeurs
    ArrayList<Vendeur> mockVendeurs = mock(ArrayList.class);

    // Injecter le mock de la liste de vendeurs dans l'application
    App3 app = new App3();
    app.vendeurs = mockVendeurs;

    // Simuler la vérification du vendeur dans la liste de vendeurs
    when(mockVendeurs.contains(vendeurMock)).thenReturn(true);

    // Appel de la méthode loginVendeur()
    Vendeur result = app.loginVendeur();

    // Vérifier si la méthode contains a été appelée sur le mock de la liste de vendeurs avec le vendeur simulé
    verify(mockVendeurs).contains(vendeurMock);

    // Vérifier que le résultat retourné est null
    assertNull(result);
}

    /**
     * Test of menuVendeur method, of class App3.
     */
@Test
    public void testMenuVendeur() {
        System.out.println("menuVendeur");
        Vendeur vendeur = null;
        App3.menuVendeur(vendeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterProduit method, of class App3.
     */
  @Test
public void testAjouterProduit() {
    System.out.println("ajouterProduit");

    // Créer un mock de la classe Vendeur
    Vendeur vendeurMock = mock(Vendeur.class);

    // Appeler la méthode ajouterProduit() avec le vendeur simulé en tant que paramètre
    App3.ajouterProduit(vendeurMock);

    // Vérifier si la méthode ajouterProduit() a été appelée sur le vendeur simulé
    verify(vendeurMock).ajouterProduit(any(Produit.class));
}


    /**
     * Test of voirListeProduits method, of class App3.
     */
 @Test
    public void testVoirListeProduits() {
        System.out.println("voirListeProduits");
        Vendeur vendeur = null;
        App3.voirListeProduits(vendeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of supprimerProduit method, of class App3.
     */
    @Test
    public void testSupprimerProduit() {
        System.out.println("supprimerProduit");
        Vendeur vendeur = null;
        App3.supprimerProduit(vendeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechercherProduit method, of class App3.
     */
    @Test
    public void testRechercherProduit() {
        System.out.println("rechercherProduit");
        App3.rechercherProduit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consulterArticles method, of class App3.
     */
    @Test
    public void testConsulterArticles() {
        System.out.println("consulterArticles");
        App3.consulterArticles();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estProduitDisponible method, of class App3.
     */
    @Test
    public void testEstProduitDisponible() {
        System.out.println("estProduitDisponible");
        Produit produit = null;
        boolean expResult = false;
        boolean result = App3.estProduitDisponible(produit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of faireOffre method, of class App3.
     */
    @Test
    public void testFaireOffre() {
        System.out.println("faireOffre");
        Acheteur acheteur = null;
        App3.faireOffre(acheteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierDateExpirationProduits method, of class App3.
     */
    @Test
    public void testVerifierDateExpirationProduits() {
        System.out.println("verifierDateExpirationProduits");
        App3.verifierDateExpirationProduits();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifierExpirationProduit method, of class App3.
     */
    @Test
    public void testNotifierExpirationProduit() {
        System.out.println("notifierExpirationProduit");
        Produit produit = null;
        App3.notifierExpirationProduit(produit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifierAcheteurOffreAcceptee method, of class App3.
     */
    @Test
public void testNotifierAcheteurOffreAcceptee() {
    System.out.println("notifierAcheteurOffreAcceptee");

    // Créer un mock de la classe Acheteur
    Acheteur acheteurMock = mock(Acheteur.class);

    // Créer un mock de la classe Produit
    Produit produitMock = mock(Produit.class);

    // Appeler la méthode notifierAcheteurOffreAcceptee() avec les mocks en tant que paramètres
    App3 instance = new App3();
    instance.notifierAcheteurOffreAcceptee(acheteurMock, produitMock);

    // Vérifier si l'acheteur est notifié correctement
    //verify(acheteurMock).offreAcceptee(produitMock);

    // Vous pouvez ajouter d'autres vérifications si nécessaire
}

    
}

