# Cálculo de Tempo de Execução - Algoritmo 2

Considerando que x esta em A[1..n]

```http
Esq = 1
Dir = 1
Enquanto Esq <= Dir faça
    Meio = (Esq + Dir) / 2
    Se  A[Meio] == x então
        Devolve Meio
    Senao se x > A[meio] então
        Esq = meio + 1
    Senao
        Dir = meio + 1
Devolva -1
```

## Contagem de instruções por linha
```http
Linha 1: executa 1 vez
Linha 2: executa 1 vez
Linha 3: executa Px vezes
Linha 4: executa Px vezes
Linha 5: executa Px vezes
Linha 6: executa 1 vez
Linha 7: Px - 1
Linha 8: Px - 1
Linha 9: Px - 1
```

## Tempo total

```http
Tble(n) = 2T + Tpx + 4Tpx + 2Tpx + 2T(Px - 1) + 2T(Px - 1) + T
= 2T + 7Tpx + 2Tpx - 2T + 2Tpx - 2T + T
= 11Tpx - T
```