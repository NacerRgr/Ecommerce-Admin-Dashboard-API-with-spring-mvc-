# Academic Relational Database Project

## Entity Model

The project is developed for the "Relational Database" course and focuses on creating a relational database for specific requirements outlined in the course. Below is the entity model for the project:

### Entities

1. **PAYMENT**
   - IdPayment
   - Montant
   - Method (enum)
   - TotalDeposit
   - PaymentDate
   - CodeClient (foreign key)
   - NoFacture (foreign key)

2. **FACTURE**
   - NoFacture
   - LastUpdate
   - FraisDeService
   - FraisDeLivraison
   - Depot
   - Remise
   - DateFacture
   - NoCommande (foreign key)

3. **LIVRAISON**
   - IdLivraison
   - DispatchedDate
   - ArrivalDate
   - FreeDelivery

4. **ENTREPRISE**
   - IdEntreprise
   - Email
   - Website

5. **ITEM**
   - CodeItem
   - NomItem
   - Marque
   - Categorie
   - Prix
   - QuantitéEnStock

6. **CONTENIR_IT_CO_LI**
   - IdContenir
   - ItemStatus (enum)
   - LivraisonStatus
   - Quantité
   - IdLivraison (foreign key)
   - CodeItem (foreign key)
   - NoCommande (foreign key)

7. **COMMANDE**
   - NoCommande
   - OrderStatus (enum)
   - Total
   - OrderDate
   - IdConcierge (foreign key)
   - CodeClient (foreign key)

8. **POINTS**
   - IdPoint
   - Nombre
   - DateExpiration

9. **CONTENIR_ME_PO**
   - IdPoint (foreign key)
   - IdMembership (foreign key)

10. **PROMOTION_COM**
    - IdPromotionCom
    - Pourcentage
    - DateDebut
    - DateFin
    - Rank
    - IdConcierge (foreign key)
    - IdCommande (foreign key)

11. **MEMBERSHIP**
    - IdMembership
    - Rank (enum)
    - CodeClient (foreign key)

12. **PROMOTION_ITEM**
    - IdPromotion
    - Montant
    - DateDebut
    - DateFin
    - Rank
    - IdConcierge (foreign key)
    - IdLog (foreign key)

13. **prom_com_log**
    - IdLog
    - Description
    - NoCommande (foreign key)

14. **Concierge**
    - IdConcierge
    - Nom
    - NumTel

15. **Client**
    - CodeClient
    - NomClient
    - Facebook
    - Instagram
    - Phone
    - Email

![image](https://github.com/NacerRgr/Project_BDD/assets/99547111/a4a2c426-37c0-4a95-a527-a9cc00cb3964)
