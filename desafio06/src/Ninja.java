public record Ninja(String nome, int idade, String vila) {

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Vila: " + vila;
    }
}
