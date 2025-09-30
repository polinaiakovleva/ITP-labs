#include <stdio.h>

enum Week {
    Monday = 1,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday,
};

const char* weekday(int day) {
    switch(day) {
        case Monday:
            return "Monday";
        case Tuesday:
            return "Tuesday";
        case Wednesday:
            return "Wednesday";
        case Thursday:
            return "Thursday";
        case Friday:
            return "Friday";
        case Saturday:
            return "Saturday";
        case Sunday:
            return "Sunday";
    }
}

int main() {
    enum Week user_day;
    printf("Enter number: ");
    scanf("%d", &user_day);
    printf("Day %d is %s", user_day, weekday(user_day));
    return 0;
}