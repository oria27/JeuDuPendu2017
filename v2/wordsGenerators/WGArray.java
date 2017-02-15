package v2.wordsGenerators;

import v2.WordsGenerator;

public class WGArray implements WordsGenerator {

	String wordList[] = { "bleu", "super", "autre", "bizarre", "difficile", "drôle", "étrange", "facile", "grave",
			"impossible", "jeune", "juste", "libre", "malade", "même", "pauvre", "possible", "propre", "rouge", "sale",
			"simple", "tranquille", "triste", "vide", "bonne", "toute", "doux", "faux", "français", "gros", "heureux",
			"mauvais", "sérieux", "vieux", "vrai", "ancien", "beau", "blanc", "certain", "chaud", "cher", "clair",
			"content", "dernier", "désolé", "différent", "droit", "entier", "fort", "froid", "gentil", "grand", "haut",
			"humain", "important", "joli", "léger", "long", "meilleur", "mort", "noir", "nouveau", "pareil", "petit",
			"plein", "premier", "prêt", "prochain", "quoi", "seul", "tout", "vert", "vivant", "aide", "chef", "enfant",
			"garde", "gauche", "geste", "gosse", "livre", "merci", "mort", "ombre", "part", "poche", "professeur",
			"tour", "fois", "madame", "paix", "voix", "affaire", "année", "arme", "armée", "attention", "balle",
			"boîte", "bouche", "carte", "cause", "chambre", "chance", "chose", "classe", "confiance", "couleur", "cour",
			"cuisine", "dame", "dent", "droite", "école", "église", "envie", "épaule", "époque", "équipe", "erreur",
			"espèce", "face", "façon", "faim", "famille", "faute", "femme", "fenêtre", "fête", "fille", "fleur",
			"force", "forme", "guerre", "gueule", "habitude", "heure", "histoire", "idée", "image", "impression",
			"jambe", "joie", "journée", "langue", "lettre", "lèvre", "ligne", "lumière", "main", "maison", "maman",
			"manière", "marche", "merde", "mère", "minute", "musique", "nuit", "odeur", "oreille", "parole", "partie",
			"peau", "peine", "pensée", "personne", "peur", "photo", "pièce", "pierre", "place", "police", "porte",
			"présence", "prison", "putain", "question", "raison", "réponse", "robe", "route", "salle", "scène",
			"seconde", "sécurité", "semaine", "situation", "soeur", "soirée", "sorte", "suite", "table", "terre",
			"tête", "vérité", "ville", "voiture", "avis", "bois", "bras", "choix", "corps", "cours", "gars", "mois",
			"pays", "prix", "propos", "sens", "temps", "travers", "vieux", "accord", "agent", "amour", "appel", "arbre",
			"argent", "avenir", "avion", "bateau", "bébé", "besoin", "bonheur", "bonjour", "bord", "boulot", "bout",
			"bruit", "bureau", "café", "camp", "capitaine", "chat", "chemin", "chéri", "cheval", "cheveu", "chien",
			"ciel", "client", "cœur", "coin", "colonel", "compte", "copain", "côté", "coup", "courant", "début",
			"départ", "dieu", "docteur", "doigt", "dollar", "doute", "droit", "effet", "endroit", "ennemi", "escalier",
			"esprit", "état", "être", "exemple", "fait", "film", "flic", "fond", "français", "frère", "front", "garçon",
			"général", "genre", "goût", "gouvernement", "grand", "groupe", "haut", "homme", "honneur", "hôtel",
			"instant", "intérêt", "intérieur", "jardin", "jour", "journal", "lieu", "long", "maître", "mari", "mariage",
			"matin", "médecin", "mètre", "milieu", "million", "moment", "monde", "monsieur", "mouvement", "moyen",
			"noir", "nouveau", "numéro", "oeil", "oiseau", "oncle", "ordre", "papa", "papier", "parent", "passage",
			"passé", "patron", "père", "petit", "peuple", "pied", "plaisir", "plan", "point", "pouvoir", "premier",
			"présent", "président", "prince", "problème", "quartier", "rapport", "regard", "reste", "retard", "retour",
			"rêve", "revoir", "salut", "sang", "secret", "seigneur", "sentiment", "service", "seul", "siècle", "signe",
			"silence", "soir", "soldat", "soleil", "sourire", "souvenir", "sujet", "téléphone", "tout", "train",
			"travail", "trou", "truc", "type", "vent", "ventre", "verre", "village", "visage", "voyage", "fils", "gens",
			"abandonner", "accepter", "accompagner", "acheter", "adorer", "agir", "aider", "aimer", "ajouter", "aller",
			"amener", "amuser", "annoncer", "apercevoir", "apparaître", "appeler", "apporter", "apprendre", "approcher",
			"arranger", "arrêter", "arriver", "asseoir", "assurer", "attaquer", "atteindre", "attendre", "avancer",
			"avoir", "baisser", "battre", "boire", "bouger", "brûler", "cacher", "calmer", "casser", "cesser",
			"changer", "chanter", "charger", "chercher", "choisir", "commencer", "comprendre", "compter", "conduire",
			"connaître", "continuer", "coucher", "couper", "courir", "couvrir", "craindre", "crier", "croire", "danser",
			"décider", "découvrir", "dégager", "demander", "descendre", "désoler", "détester", "détruire", "devenir",
			"deviner", "devoir", "dire", "disparaître", "donner", "dormir", "échapper", "écouter", "écrire", "éloigner",
			"embrasser", "emmener", "empêcher", "emporter", "enlever", "entendre", "entrer", "envoyer", "espérer",
			"essayer", "être", "éviter", "excuser", "exister", "expliquer", "faire", "falloir", "fermer", "filer",
			"finir", "foutre", "frapper", "gagner", "garder", "glisser", "habiter", "ignorer", "imaginer", "importer",
			"inquiéter", "installer", "intéresser", "inviter", "jeter", "jouer", "jurer", "lâcher", "laisser", "lancer",
			"lever", "lire", "maintenir", "manger", "manquer", "marcher", "marier", "mener", "mentir", "mettre",
			"monter", "montrer", "mourir", "naître", "obliger", "occuper", "offrir", "oser", "oublier", "ouvrir",
			"paraître", "parler", "partir", "passer", "payer", "penser", "perdre", "permettre", "plaire", "pleurer",
			"porter", "poser", "pousser", "pouvoir", "préférer", "prendre", "préparer", "présenter", "prévenir",
			"prier", "promettre", "proposer", "protéger", "quitter", "raconter", "ramener", "rappeler", "recevoir",
			"reconnaître", "réfléchir", "refuser", "regarder", "rejoindre", "remarquer", "remettre", "remonter",
			"rencontrer", "rendre", "rentrer", "répéter", "répondre", "reposer", "reprendre", "ressembler", "rester",
			"retenir", "retirer", "retourner", "retrouver", "réussir", "réveiller", "revenir", "rêver", "revoir",
			"rire", "risquer", "rouler", "sauter", "sauver", "savoir", "sembler", "sentir", "séparer", "serrer",
			"servir", "sortir", "souffrir", "sourire", "souvenir", "suffire", "suivre", "taire", "tendre", "tenir",
			"tenter", "terminer", "tirer", "tomber", "toucher", "tourner", "traîner", "traiter", "travailler",
			"traverser", "tromper", "trouver", "tuer", "utiliser", "valoir", "vendre", "venir", "vivre", "voir",
			"voler", "vouloir" };

	@Override
	public String getWord() {
		
		int i = (int) (Math.random() * wordList.length);

		// System.out.println(wordList.length +" "+ i);
		
		return wordList[i];
	}
}