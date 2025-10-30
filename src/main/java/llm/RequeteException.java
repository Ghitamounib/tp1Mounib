package llm; // 🟣 À adapter selon ton projet (ex: com.example.gemini.llm)

/**
 * Exception levée si une requête vers l'API du LLM échoue.
 */
public class RequeteException extends Exception {

    /**
     * Statut HTTP de la réponse du LLM (ex: 400, 401, 500...).
     */
    private int status;

    /**
     * Corps JSON de la requête envoyée (utile pour le débogage).
     */
    private String requeteJson;

    // 🔹 Constructeurs

    public RequeteException() {
        super();
    }

    public RequeteException(int status) {
        super("Erreur de communication avec le LLM (statut HTTP : " + status + ")");
        this.status = status;
    }

    public RequeteException(String message) {
        super(message);
    }

    public RequeteException(String message, String requeteJson) {
        super(message);
        this.requeteJson = requeteJson;
    }

    // 🔹 Getters

    public int getStatus() {
        return status;
    }

    public String getRequeteJson() {
        return requeteJson;
    }

    @Override
    public String toString() {
        return "RequeteException{" +
                "status=" + status +
                ", message='" + getMessage() + '\'' +
                ", requeteJson='" + requeteJson + '\'' +
                '}';
    }
}
