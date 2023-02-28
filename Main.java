/ Biblioteca

//   În limbajul de programare Java se va realiza reprezentarea grafică a situațiilor de mai jos.
// Numărul publicațiilor (n) va fi maxim 10 și acesta se va genera aleator.

//   Cerinte:
// 1. Dacă numărul publicațiilor împrumutate este divizibil cu 2, se vor afișa n/2 pătrate de culoare galbenă.

// 2. Dacă numărul publicațiilor împrumutate este divizibil cu 3, se vor afișa n/3 pătrate de culoare roșie.

// 3. Dacă numărul publicațiilor împrumutate este divizibil cu 2 și 3, se vor afișa n/2 +1 pătrate de culoare albastră.

// 4. Dacă numărul publicațiilor împrumutate nu este divizibil cu 2 sau 3, se vor afișa n pătrate de culoare verde.



public class Main {   // clasa Main

  public static void main(String[] args) { // metoda principala, constructorul clasei Main
    int min = 1; // limita inferioara a generatorului de numere
    int max = 10; //limita superioara
    int n = (int)Math.floor(Math.random() * (max - min + 1) + min); // generam un numar aleator cuprins intre 1 si 10 inclusiv
     if(n==1)
         {
         System.out.println(n + " carte inprumutata."); //afisam numarul generat aleator
         }
        else 
         {
         System.out.println(n + " carti inprumutate."); //afisam numarul generat aleator
         }

// incepem procesul de selectare al numerelor generate folosint functiile if, if else, else, vom apela clasele predefinite pentru a putea afisa numarul cartilor de returnat reprezentate prin patratele
    if(n % 2 == 0 && n % 3 == 0) // numar divizibil cu 2 si 3 
     {
      Square cap; //instantiem o variabila cap care mosteseste clasa Square   
      int pozitie = 0;// hardcodam pozitia initiala
      System.out.print("Utilizatorul este rugat sa returneze: ");    
      System.out.print(n/2+1);
      System.out.print(" carti.");
      // folosim bucla for pentru a putea genera numarul dorit de patratele in functie de n       
      for (int i = 1; i <=n/2+1; i++)
      {
        cap = new Square();//constructorul unui Square
        cap.makeVisible();// metoda pentru vizibilitate
        cap.changeColor("blue");//metoda care schimba culoarea patratului
        cap.moveHorizontal(pozitie);// metoda care modifica pozitia orizontala in functie de puctul de andocare
        pozitie = pozitie+40;//pozitia incrementata cu 40 de pixeli
       }        
     }
          
        else if(n % 2 == 0)// numar divizibil cu 2
        {
          Square cap;    
          int pozitie = 0;    
          
              if(n/2 == 1)
                {
                 System.out.print("Utilizatorul este rugat sa returneze: " + n/2 + " carte.");
                }
              else 
                {
                System.out.print("Utilizatorul este rugat sa returneze: " + n/2 + " carti.");
                   }
          for (int i = 1; i<=n/2; i++)
           {
            cap = new Square();
            cap.makeVisible();
            cap.changeColor("yellow");
            cap.moveHorizontal(pozitie);
            pozitie = pozitie+40;
            }  
        } 
  
        else if(n % 3 == 0) // numar divizibil cu 3
        {
          Square cap;    
          int pozitie = 0; 
          
              if(n/2 == 1)
                {
                 System.out.print("Utilizatorul este rugat sa returneze: " + n/3 + " carte.");
                }
              else 
                {
                System.out.print("Utilizatorul este rugat sa returneze: " + n/3 + " carti.");
                   }
          for (int i = 1; i<=n/3; i++)
           {
            cap = new Square();
            cap.makeVisible();
            cap.changeColor("red");
            cap.moveHorizontal(pozitie);
            pozitie = pozitie+40;
            }  
         }

          else // numar divizibil cu numar diferit de 3 si 2
          { 
            Square cap;    
            int pozitie = 0;
            if(n == 1)
                {
                 System.out.print("Utilizatorul este rugat sa returneze: " + n + " carte.");
                }
              else 
                {
                System.out.print("Utilizatorul este rugat sa returneze: " + n + " carti.");
                }
            for (int i = 1; i<=n; i++)
             {
              cap = new Square();
              cap.makeVisible();
              cap.changeColor("green");
              cap.moveHorizontal(pozitie);
              pozitie = pozitie+40;
             }  
          }
  
  }
}  



// Biblioteca

//   În limbajul de programare Java se va realiza reprezentarea grafică a situațiilor de mai jos.
// Numărul publicațiilor (n) va fi maxim 10 și acesta se va genera aleator.

//   Cerinte:
// 1. Dacă numărul publicațiilor împrumutate este divizibil cu 2, se vor afișa n/2 pătrate de culoare galbenă.

// 2. Dacă numărul publicațiilor împrumutate este divizibil cu 3, se vor afișa n/3 pătrate de culoare roșie.

// 3. Dacă numărul publicațiilor împrumutate este divizibil cu 2 și 3, se vor afișa n/2 +1 pătrate de culoare albastră.

// 4. Dacă numărul publicațiilor împrumutate nu este divizibil cu 2 sau 3, se vor afișa n pătrate de culoare verde.