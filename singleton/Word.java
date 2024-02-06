public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * Sets the word attributes to ones passed into constructor
     * @param word The word you'd like to define.
     * @param type The type of the word noun, adj, etc.
     * @param definition definition of the word.
     * @param sentence example of a sentence using the word.
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * getter method for word
     * @return A string representation of the word.
     */
    public String getWord() {
        return word;
    }

        /**
         * builds word string that displays to UI
         * contains all word attribues
         * @return word attribute representation for UI.
         */
    public String getDescription() {
        return "Part of Speech: "+type+"\nDefintion: "+definition+"\n"+sentence;
    }
}
