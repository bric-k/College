#include <stdio.h>
#include <stdlib.h>

//defining max order number
#define MAX_ORDERS 10

//keep track of queue
typedef struct {
    int front;
    int rear;
    int items[MAX_ORDERS];
} Queue;

//used to define functions to remove or add to queue
void enqueue(Queue *q, int item);
int dequeue(Queue *q);
//used to define functions to check if queue is full or empty
int is_empty(Queue *q);
int is_full(Queue *q);

int main() {
    Queue orders = {0, 0, {0}};
    int max_orders, num_orders;
//specify max orders
    printf("Enter the maximum number of orders: ");
    scanf("%d", &max_orders);

    printf("Enter the number of orders: ");
    scanf("%d", &num_orders);

    if (num_orders > max_orders) {
        printf("Maximum order capacity has been reached.\n");
        exit(1);
    }

    // enqueue
    printf("Orders to be served: \n");
    for (int i = 0; i < num_orders; i++) {
        int order_num;
        scanf("%d", &order_num);
//exit if full queue
        if (is_full(&orders)) {
            printf("The queue is full.\n");
            exit(1);
        }

        enqueue(&orders, order_num);
    }

    //serving
    printf("Serving orders:\n");
    while (!is_empty(&orders)) {
        int order_num = dequeue(&orders);
        printf("Order %d served.\n", order_num);
    }

    return 0;
}

//enque
void enqueue(Queue *q, int item) {
    q->items[q->rear++] = item;
}

// dequeue function
int dequeue(Queue *q) {
    return q->items[q->front++];
}

// function to check for empty queue
int is_empty(Queue *q) {
    return q->front == q->rear;
}

// function to check for full queue
int is_full(Queue *q) {
    return q->rear == MAX_ORDERS;
}
