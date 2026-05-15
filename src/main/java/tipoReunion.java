public enum tipoReunion {

    TECNICA,
    MARKETING,
    OTRO;

    @Override
    public String toString() {
        switch (this) {
            case TECNICA: return "Tecnica";
            case MARKETING: return "Marketing";
            case OTRO: return "Otro";
            default: return this.name();
        }
    }
}
