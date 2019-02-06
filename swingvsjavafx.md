# Comparaison Swing vs Java FX

La partie graphique du jeu de Memory peut être réalisée en Swing ou JavaFX.

*Si vous utilisez une version de Java supérieure à Java 8, JavaFX n'est plus livré en standard avec JavaFX : il est plus simple de faire l'interface en Swing.*

| Usage | Swing | JavaFX |
|-------|-------|--------|
|Fenêtre graphique | [JFrame](https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html) | [Stage](https://docs.oracle.com/javase/8/javafx/api/javafx/stage/Stage.html)|
|Bouton | [JButton](https://docs.oracle.com/javase/8/docs/api/javax/swing/JButton.html) |[Button](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Button.html)|
|Texte | [JLabel](https://docs.oracle.com/javase/8/docs/api/javax/swing/JLabel.html) | [Label](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Label.html)|
|Conteneur d'objets graphique | [JPanel](https://docs.oracle.com/javase/8/docs/api/javax/swing/JPanel.html) |Racine : [Scene](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Scene.html)|
|Conteneur d'objets graphique | [JPanel](https://docs.oracle.com/javase/8/docs/api/javax/swing/JPanel.html) |[Group](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Group.html)|
|Grille de composants | [GridLayout](https://docs.oracle.com/javase/8/docs/api/java/awt/GridLayout.html) |[GridPane](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html)|
|Action | [ActionListener](https://docs.oracle.com/javase/8/docs/api/java/awt/event/ActionListener.html)|[EventHandler](https://docs.oracle.com/javase/8/javafx/api/javafx/event/EventHandler.html)|
