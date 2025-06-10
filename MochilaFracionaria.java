import java.util.*;

public class MochilaFracionaria {

    static class Item {
        double valor;
        double peso;

        Item(double valor, double peso) {
            this.valor = valor;
            this.peso = peso;
        }

        double getValorPorPeso() {
            return valor / peso;
        }
    }

    public static double resolverMochilaFracionaria(List<Item> itens, double capacidade) {
        // Ordena os itens com base no valor por unidade de peso (decrescente)
        itens.sort((a, b) -> Double.compare(b.getValorPorPeso(), a.getValorPorPeso()));

        double valorTotal = 0.0;

        for (Item item : itens) {
            if (capacidade >= item.peso) {
                // Adiciona o item inteiro
                capacidade -= item.peso;
                valorTotal += item.valor;
            } else {
                // Adiciona a fração do item que cabe
                valorTotal += item.getValorPorPeso() * capacidade;
                break; // mochila cheia
            }
        }

        return valorTotal;
    }

    public static void main(String[] args) {
        List<Item> itens = Arrays.asList(
            new Item(80, 10),
            new Item(120, 20),
            new Item(180, 30),
            new Item(160, 40)
        );

        double capacidade = 60;
        double resultado = resolverMochilaFracionaria(itens, capacidade);

        System.out.printf("Valor total na mochila: %.2f\n", resultado);
    }
}