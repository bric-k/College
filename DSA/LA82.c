#include <stdio.h>
#include <stdlib.h>

#define MAX_VERTICES 100

int graph[MAX_VERTICES][MAX_VERTICES];
int visited[MAX_VERTICES];
int queue[MAX_VERTICES];

int front = -1, rear = -1;

int isQueueEmpty() {
  if (front == -1 || front > rear) {
    return 1;
  } else {
    return 0;
  }
}

void enqueue(int vertex) {
  if (rear == MAX_VERTICES - 1) {
    printf("Queue is full\n");
  } else {
    if (front == -1) {
      front = 0;
    }
    rear++;
    queue[rear] = vertex;
  }
}

int dequeue() {
  int item;
  if (isQueueEmpty()) {
    printf("Queue is empty\n");
    item = -1;
  } else {
    item = queue[front];
    front++;
  }
  return item;
}

void breadthFirstSearch(int vertex, int numVertices) {
  int i;
  enqueue(vertex);
  visited[vertex] = 1;
  printf("BFS traversal starting from vertex %d: ", vertex);
  while (!isQueueEmpty()) {
    int currentNode = dequeue();
    printf("%d ", currentNode);
    for (i = 0; i < numVertices; i++) {
      if (graph[currentNode][i] == 1 && !visited[i]) {
        enqueue(i);
        visited[i] = 1;
      }
    }
  }
  printf("\n");
}

void depthFirstSearch(int vertex, int numVertices) {
  int i;
  visited[vertex] = 1;
  printf("%d ", vertex);
  for (i = 0; i < numVertices; i++) {
    if (graph[vertex][i] == 1 && !visited[i]) {
      depthFirstSearch(i, numVertices);
    }
  }
}

int main() {
  int numVertices, i, j, sourceVertex;

  printf("Enter the number of vertices: ");
  scanf("%d", &numVertices);

  printf("Enter the adjacency matrix: \n");
  for (i = 0; i < numVertices; i++) {
    for (j = 0; j < numVertices; j++) {
      scanf("%d", &graph[i][j]);
    }
  }

  for (i = 0; i < numVertices; i++) {
    visited[i] = 0;
  }

  printf("Enter the source vertex for BFS traversal: ");
  scanf("%d", &sourceVertex);
  breadthFirstSearch(sourceVertex, numVertices);

  for (i = 0; i < numVertices; i++) {
    visited[i] = 0;
  }

  printf("DFS traversal starting from vertex %d: ", sourceVertex);
  depthFirstSearch(sourceVertex, numVertices);
  printf("\n");

  return 0;
}
