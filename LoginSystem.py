correctUsername = "Kythe"
correctPassword = "123"
loop = True
while loop: 
    typeUsername = input("Enter Username: ")
    typePassword = input("Enter Password: ") 
    if typeUsername == correctUsername and typePassword == correctPassword:
        print("Login Successfully")
        loop = False
    else:
        print("Login Failed")