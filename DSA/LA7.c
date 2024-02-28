#include <stdio.h>
#include <stdlib.h>

// Define the structure for a node in the binary search tree
struct node {
    int data;
    struct node* left;
    struct node* right;
};

// Function to create a new node with the given data
struct node* createNode(int data) {
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert a new node into the binary search tree
struct node* insertNode(struct node* root, int data) {
    if (root == NULL) {
        return createNode(data);
    } else if (data < root->data) {
        root->left = insertNode(root->left, data);
    } else if (data > root->data) {
        root->right = insertNode(root->right, data);
    }
    return root;
}

// Function to search for a node with the given data in the binary search tree
struct node* searchNode(struct node* root, int data) {
    if (root == NULL || root->data == data) {
        return root;
    } else if (data < root->data) {
        return searchNode(root->left, data);
    } else {
        return searchNode(root->right, data);
    }
}

// Function to perform an inorder traversal of the binary search tree
void inorderTraversal(struct node* root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

// Function to perform a preorder traversal of the binary search tree
void preorderTraversal(struct node* root) {
    if (root != NULL) {
        printf("%d ", root->data);
        preorderTraversal(root->left);
        preorderTraversal(root->right);
    }
}

// Function to perform a postorder traversal of the binary search tree
void postorderTraversal(struct node* root) {
    if (root != NULL) {
        postorderTraversal(root->left);
        postorderTraversal(root->right);
        printf("%d ", root->data);
    }
}

// Main function to display a menu and perform the binary search tree operations
int main() {
    struct node* root = NULL;
    int choice, value;
    struct node* searchResult;

    do {
        printf("\n\nBinary Search Tree Operations\n");
        printf("----------------------------\n");
        printf("1. Create a binary search tree\n");
        printf("2. Search for a value in the tree\n");
        printf("3. Traverse the tree in inorder\n");
        printf("4. Traverse the tree in preorder\n");
        printf("5. Traverse the tree in postorder\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the root value of the tree: ");
                scanf("%d", &value);
                root = insertNode(root, value);
                printf("Enter the values to insert into the tree (-1 to stop): ");
                while (1) {
                    scanf("%d", &value);
                    if (value == -1) {
                        break;
                    }
                    insertNode(root, value);
                }
                printf("Binary search tree created successfully\n");
                break;
            case 2:
                printf("Enter the value to search for: ");
                scanf("%d", &value);
                searchResult = searchNode(root, value);
                if (searchResult != NULL) {
                    printf("%d found in the binary search tree\n", value);
                } else {
                    printf("%d not found in the binary search tree\n", value);
                }
                break;
             case 3:
                printf("Inorder traversal of the binary search tree: ");
                inorderTraversal(root);
                break;
            case 4:
                printf("Preorder traversal of the binary search tree: ");
                preorderTraversal(root);
                break;
            case 5:
                printf("Postorder traversal of the binary search tree: ");
                postorderTraversal(root);
                break;
            case 6:
                printf("Exiting\n");
                break;
            default:
                printf("Invalid choice\n");
                break;
        }
    } while (choice != 6);

    return 0;
}