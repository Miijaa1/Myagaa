#include <stdio.h>
#include <stdlib.h>
int main() {
    int n, i;
    int F[1000];
    int N[1000];
    int max, min, sum;
    int j, temp, count = 0;
    printf("Heden too oruulah ve: ");
    scanf("%d", &n);
    if (n <= 0 || n > 1000) {
        printf("Buruu too oruulsan baina!\n");
        return 1;
    }
    printf("Toonuudaa oruulna uu:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &F[i]);
    }
    max = F[0];
    min = F[0];
    sum = 0;
    for (i = 0; i < n; i++) {
        if (F[i] > max) max = F[i];
        if (F[i] < min) min = F[i];
        sum += F[i];
    }
    float average = (float) sum / n;
    
    for (i = 0; i < n; i++) {
        if (F[i] % 2 == 0) {
            N[count] = F[i];
            count++;
        }
    }
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (F[j] > F[j + 1]) {
                temp = F[j];
                F[j] = F[j + 1];
                F[j + 1] = temp;
            }
        }
    }
    printf("\nMax utga: %d\n", max);
    printf("Min utga: %d\n", min);
    printf("Sum: %d\n", sum);
    printf("Average: %.2f\n", average);\
    printf("Tegsh toonuud\n");
    if (count == 0) {
        printf("Tegsh too baihgui.\n");
    } else {
        for (i = 0; i < count; i++) {
            printf("%d ", N[i]);
        }
    }
    printf("\nErembelsen buh toonuud:\n");
    for (i = 0; i < n; i++) {
        printf("%d ", F[i]);
    }
    return 0;
}

