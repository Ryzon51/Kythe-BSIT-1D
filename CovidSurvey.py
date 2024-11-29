print ("COVID-19 SURVEY")
while True:
    Q1 = input("Do you have a fever? (yes/no) ")
    Q2 = input("Do you have a cough? (yes/no) ")
    Q3 = input("Do you have difficulty in breathing? (yes/no) ")
    if Q1.casefold() == 'yes' or Q2.casefold() == 'yes' or Q3.casefold() == 'yes':
        print("You may need to seek medical advice.")
    else:
        print("You seem to be fine.")
    repeat = input("Do you want to check again? (yes/no) ")
    if repeat.casefold() == 'no':
        break
print ("Thank you")