# Cálculo de Tempo de Execução - Algoritmo 2

Considerando que x esta em A[1..n]

```http
Function BuscaLinerarEmOrdem(A,n,x)
i=1
enquanto i <= e x >= A[i] faça
    Se A[i]== x então
        Devolva i
    i= i + 1
Devolva -1
```

## Contagem de instruções por linha
```http
Linha 1: executa 1 vez
Linha 2: executa Px vezes
Linha 3: executa Px vezes
Linha 4: executa 1 vez
Linha 5: Px - 1
```

## Tempo total, 1ª e Última Posição

Tempo total:
```http
Tble(n) = T + 4Tpx + 2Tpx + 2T(Px - 1) + T
= 2T + 6Tpx + 2Tpx - 2T
= 8Tpx
```

1ª Posição: 
```http
Tble(n) = T + 4T*1 + 2T*1 + 2T(1 - 1) + T
= 5T + 2T + 2T - 2T + T
= 8T
```

Última posição: 
```http
8T * n
= 8Tn
```