public class Magpie {
    
    /**
     * A default constuctor
     */
    public Magpie(){
    }
   
    /**
     * Get a default greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     */
    public String getResponse(String statement) {
        String response = "";
        if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        } 
        else if (statement.indexOf("mother") >= 0) {
            response = "Tell me more about your mother.";
        } 
        else if (statement.indexOf("Wilson") >= 0) {
        
            response = "Your professor sounds like a good teacher";
        }
        else if (statement.trim().equals("")) {
            response = "Say something, please.";
        }
        else if (statement.indexOf("father") >= 0) {
            response = "Tell me more about your father!";
        }
        else if (statement.indexOf("basketball") >= 0) {
            response = "I love basketball, what position do you play?";
        }
        else if (statement.indexOf("Wilson") >= 0) {
            response = "Your professor sounds great!";
        }


        else if (statement.indexOf("TV") >= 0) {
            response = "TV is great";
        }



        if (response.length() == 0) {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a generic response to use if nothing else fits.
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        }  
        if (whichResponse == 1) {
            response = "Hmmm.";
        } 
        if (whichResponse == 2) {
            response = "Do you really think so?";
        } 
        if (whichResponse == 3) {
            response = "You don't say.";
        }
        if (whichResponse == 4) {
            response = "What was that?";
        }
        if (whichResponse == 5) {
            response = "How did you figure that out?";
        }

        return response;
    }
}
