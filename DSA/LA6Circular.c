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

    printf("Enter the maximum number of orders: ");
    scanf("%d", &max_orders);

    printf("Enter the number of orders: ");
    scanf("%d", &num_orders);

    if (num_orders > max_orders) {
        printf("Maximum order capacity has been reached.\n");
        exit(1);
    }

    // Enqueue the orders
    printf("Enter the order numbers:\n");
    for (int i = 0; i < num_orders; i++) {
        int order_num;
        scanf("%d", &order_num);

        // Check if the queue is full
        if (is_full(&orders)) {
            printf("The queue is full.\n");
            exit(1);
        }

        enqueue(&orders, order_num);
    }

    // Serving
    printf("Serving orders:\n");
    while (!is_empty(&orders)) {
        int order_num = dequeue(&orders);
        printf("Order %d served.\n", order_num);
    }

    return 0;
}

// enqueue an item in the queue
void enqueue(Queue *q, int item) {
    if ((q->rear + 1) % MAX_ORDERS == q->front) {
        printf("Error: The queue is full.\n");
        exit(1);
    }

    q->items[q->rear] = item;
    q->rear = (q->rear + 1) % MAX_ORDERS;
}

//to dequeue an item from the queue
int dequeue(Queue *q) {
    if (is_empty(q)) {
        printf("The queue is empty.\n");
        exit(1);
    }

    int item = q->items[q->front];
    q->front = (q->front + 1) % MAX_ORDERS;
    return item;
}
// check if the queue is empty
int is_empty(Queue *q) {
    return q->front == q->rear;
}
//to check if the queue is full
int is_full(Queue *q) {
    return (q->rear + 1) % MAX_ORDERS == q->front;
}
