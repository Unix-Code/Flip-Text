package fliptext;

/**
 *
 * @author David
 */
public class FlipText {
    
    public String flip (String sText) {
        String lowerCaseFlippedAlphabet = "ɐqɔpǝɟƃɥıɾʞןɯuodbɹsʇnʌʍxʎz";
        String upperCaseFlippedAlphabet = "∀qƆpƎℲפHIſʞ˥WNOԀQɹS⊥∩ΛMXλZ";
        String newText = "";
        
        for (int i = 0; i < sText.length(); i++) {
            char letter = sText.charAt(i);
            if (Character.isLetter(letter)) {
                newText += (Character.isUpperCase(letter)) ? upperCaseFlippedAlphabet.charAt((int)letter - (int)'A') : lowerCaseFlippedAlphabet.charAt((int)letter - (int)'a');
            }
            else {
                newText += letter;
            }
        }
        return newText;
    }
}
