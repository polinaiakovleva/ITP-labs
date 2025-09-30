#include <stdio.h>
#include <string.h>

enum Role {
    Student,
    TA,
    Professor
};

enum Degree {
    Secondary,
    Bachelor,
    Master,
    PhD
};

struct Moodle_member {
    char name[50];
    enum Role position;
    enum Degree degree;
};

int main() {
    int members_number;
    printf("Enter the number of moodle members: ");
    scanf("%d", &members_number);

    struct Moodle_member members[members_number];
    char position[50];
    char degree[50];

    for (int i = 0; i < members_number; i++) {
        printf("Enter name, position, degree: ");
        scanf("%s %s %s", members[i].name, position, degree);
        
        if (strcmp(position, "Student") == 0) members[i].position = Student;
        else if (strcmp(position, "TA") == 0) members[i].position = TA;
        else members[i].position = Professor;
        
        if (strcmp(degree, "Secondary") == 0) members[i].degree = Secondary;
        else if (strcmp(degree, "Bachelor") == 0) members[i].degree = Bachelor;
        else if (strcmp(degree, "Master") == 0) members[i].degree = Master;
        else members[i].degree = PhD;
    }

    for (int i = 0; i < members_number - 1; i++) {
        for (int j = 0; j < members_number - i - 1; i++) {
            if (members[j].position > members[j+1].position || (members[j].position == members[j+1].position && members[j].degree > members[j+1].degree)) {
                struct Moodle_member t = members[j];
                members[j] = members[j + 1];
                members[j + 1] = t;
            }
            }
        }

        for (int i = 0; i < members_number; i++) {
            printf("%s, ", members[i].name);

            switch(members[i].position) {
                case Student: printf("Student, "); break;
                case TA: printf("TA, "); break;
                case Professor: printf("Professor, "); break;
            }
            switch(members[i].degree) {
                case Secondary: printf("Secondary\n"); break;
                case Bachelor: printf("Bachelor\n"); break;
                case Master: printf("Master\n"); break;
                case PhD: printf("PhD\n"); break;
            }
        }
        return 0;
    }
