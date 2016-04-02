package fliptext;

/**
 *
 * @author David
 */
public class FlipText {
    
    public String flip (String sText) {
        String flippedAlphabet = "ɐqɔpǝɟƃɥıɾʞןɯuodbɹsʇnʌʍxʎz";
        String text = sText.toLowerCase();
        String newText = "";
        
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLetter(letter)) {
                newText += flippedAlphabet.charAt((int)letter - (int)'a');
            }
            else {
                newText += letter;
            }
        }
        return newText;
    }
}
