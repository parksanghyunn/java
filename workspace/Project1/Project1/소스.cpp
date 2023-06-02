#include<iostream>
//#include <studio.h>

namespace std {};

int main() {
    double pDia = 0;
    double pPrice = 0;
    double pSize = 0;

    pSize = pDia * pPrice;

    printf("1.CM of Pizza:  ");
    scanf("%f", pDia);
    printf("\n");

    printf("2.price of Pizza:  ");
    scanf("%f", pPrice);
    printf("\n");

    printf("price by size is %f\n", pSize);

    return 0;
}