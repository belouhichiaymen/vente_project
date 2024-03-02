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
        System.out.println("main");
        String[] args = null;
        App3.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficherMenuPrincipal method, of class App3.
     */
    @Test
    public void testAfficherMenuPrincipal() {
        System.out.println("afficherMenuPrincipal");
        App3.afficherMenuPrincipal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerCompteAcheteur method, of class App3.
     */
    @Test
    public void testCreerCompteAcheteur() {
        System.out.println("creerCompteAcheteur");
        App3.creerCompteAcheteur();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginAcheteur method, of class App3.
     */
    @Test
    public void testLoginAcheteur() {
        System.out.println("loginAcheteur");
        Acheteur expResult = null;
        Acheteur result = App3.loginAcheteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuAcheteur method, of class App3.
     */
    @Test
    public void testMenuAcheteur() {
        System.out.println("menuAcheteur");
        Acheteur acheteur = null;
        App3.menuAcheteur(acheteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerCompteVendeur method, of class App3.
     */
    @Test
    public void testCreerCompteVendeur() {
        System.out.println("creerCompteVendeur");
        App3.creerCompteVendeur();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginVendeur method, of class App3.
     */
    @Test
    public void testLoginVendeur() {
        System.out.println("loginVendeur");
        Vendeur expResult = null;
        Vendeur result = App3.loginVendeur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        Vendeur vendeur = null;
        App3.ajouterProduit(vendeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        Acheteur acheteur = null;
        Produit produit = null;
        App3 instance = new App3();
        instance.notifierAcheteurOffreAcceptee(acheteur, produit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
