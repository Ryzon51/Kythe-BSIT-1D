import random

def choose_secret_word():
    words = ["python", "javascript", "java", "ruby", "html", "css"]
    return random.choice(words)

def display_progress(secret_word, guessed_letters):
    displayed_word = ''.join(letter if letter in guessed_letters else '_' for letter in secret_word)
    return displayed_word

def main():
    secret_word = choose_secret_word()
    guessed_letters = set()
    attempts_remaining = 6

    print("Welcome to the Secret Word Game!")
    print("You have to guess the secret word.")
    
    while attempts_remaining > 0:
        print("\nCurrent word:", display_progress(secret_word, guessed_letters))
        print(f"Attempts remaining: {attempts_remaining}")
        guess = input("Enter a letter: ").lower()

        if len(guess) != 1 or not guess.isalpha():
            print("Please enter a single letter.")
            continue
        
        if guess in guessed_letters:
            print("You've already guessed that letter.")
            continue

        guessed_letters.add(guess)

        if guess in secret_word:
            print("Good guess!")
        else:
            attempts_remaining -= 1
            print("Wrong guess.")

        if all(letter in guessed_letters for letter in secret_word):
            print(f"Congratulations! You've guessed the word: {secret_word}")
            break
    else:
        print(f"Sorry, you've run out of attempts. The secret word was: {secret_word}")

if __name__ == "__main__":
    main()
