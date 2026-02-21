Android avec Java — LAB 3 : Navigation entre activités
Objectif du TP

Dans ce laboratoire, on met en place une application Android (Java) qui permet de naviguer entre deux activités. L’utilisateur remplit un formulaire dans le premier écran, puis les informations sont transmises et affichées dans un second écran. Une amélioration “bonus” ajoute la validation de l’adresse e-mail avant de passer à l’écran 2.

1) Conception de l’interface du formulaire — activity_main.xml

Le premier écran correspond à un formulaire de saisie.
L’interface est construite à partir de plusieurs composants (ex. champs de texte, labels et boutons), organisés de façon à permettre à l’utilisateur d’entrer ses informations puis de lancer l’action d’envoi/transition vers l’activité suivante.

<img width="641" height="598" alt="image" src="https://github.com/user-attachments/assets/29196f03-769b-4c57-a4ca-8b941e9c8b8d" />


2) Interface du second écran — activity_screen2.xml

Le deuxième écran sert à présenter les données récupérées depuis le formulaire.
On y retrouve généralement des éléments d’affichage (TextView, etc.) qui montrent les valeurs reçues, avec une mise en page simple et lisible.

<img width="668" height="568" alt="image" src="https://github.com/user-attachments/assets/f4563a46-04af-41df-a7e9-aa74fd625499" />


3) Logique du formulaire — MainActivity.java

Dans MainActivity, on :

récupère les références des composants de l’interface (champs de saisie, bouton),

lit les valeurs entrées par l’utilisateur au clic sur le bouton,

crée un Intent pour ouvrir la deuxième activité,

envoie les données via des extras (ex. putExtra()).

L’objectif principal est d’assurer une transition propre et un passage d’informations fiable vers l’écran 2.

<img width="912" height="609" alt="image" src="https://github.com/user-attachments/assets/d14439d9-f628-4c21-8bc5-5a48a728684e" />
<img width="895" height="594" alt="image" src="https://github.com/user-attachments/assets/882e7664-76b8-449c-bb3b-4fdc68a170a7" />


4) Réception des données — Screen2Activity.java

Dans Screen2Activity, on :

récupère l’Intent reçu,

extrait les valeurs transmises (ex. getStringExtra()),

affiche ces informations dans les vues prévues sur l’interface.

Ce mécanisme valide le principe de communication Activity → Activity.

<img width="718" height="640" alt="image" src="https://github.com/user-attachments/assets/1dbf06be-ca25-4c82-a2c3-8c559182772f" />
<img width="824" height="488" alt="image" src="https://github.com/user-attachments/assets/dd3df76a-a693-4b27-9165-4946446a282b" />


5) Déclaration des activités — AndroidManifest.xml

Pour que l’application reconnaisse les écrans, les activités doivent être déclarées dans le fichier AndroidManifest.xml.
L’activité principale est définie comme point d’entrée, et la seconde est ajoutée pour permettre la navigation.

<img width="664" height="542" alt="image" src="https://github.com/user-attachments/assets/773b8ab9-94ed-458c-b85f-1427b5cc9c52" />


6) Test et exécution

Après compilation et lancement sur émulateur/appareil :

l’écran 1 s’affiche (formulaire),

après saisie et validation, l’utilisateur passe à l’écran 2,

les informations apparaissent correctement sur le second écran.

<img width="278" height="561" alt="image" src="https://github.com/user-attachments/assets/3722df97-116d-4e38-9d0e-9b2d425168ea" />


