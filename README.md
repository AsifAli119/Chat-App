# Android Chatting App

This Android Chatting App is built using Kotlin and Firebase. It provides real-time messaging functionality with user authentication using Firebase Authentication.

## Features

- User Registration: Users can create a new account with their email and password.
- User Login: Existing users can log in to the app using their registered email and password.
- Real-time Chatting: Users can send and receive messages in real-time.
- Chat History: The app stores chat history so users can view previous messages.
- Firebase Authentication: Firebase Authentication is used to securely manage user authentication.

## Prerequisites

Before running the app, make sure you have the following:

- Android Studio installed on your machine.
- An active Firebase project with Firebase Authentication enabled.
- Kotlin and Firebase dependencies properly configured in the project.

## Installation

1. Clone the repository to your local machine using the following command:

   ```bash
   git clone https://github.com/AsifAli119/android-chat-app.git
   ```

2. Open the cloned project in Android Studio.

3. Connect the project to your Firebase project by following these steps:
   - Create a new Firebase project (if you haven't already) in the [Firebase Console](https://console.firebase.google.com/).
   - Enable Firebase Authentication in your project.
   - Download the `google-services.json` file from the Firebase Console.
   - Move the downloaded `google-services.json` file to the `app/` directory of the project.

4. Build and run the app on an Android emulator or a physical device.

## Configuration

To configure the app with your Firebase project, modify the following files:

- `app/build.gradle`: Update the `applicationId` with your own application ID.
- `app/src/main/res/values/strings.xml`: Update the `google_app_id` with your Firebase project's `google_app_id`.

## Usage

1. Launch the app on your Android device.

2. Register a new account or log in with your existing account using the provided authentication screen.

3. Once authenticated, you'll be directed to the main chat screen.

4. Enter the chat room, where you can send and receive messages in real-time.

## Dependencies

The app relies on the following dependencies:

- Firebase Authentication: Used for user authentication.
- Firebase Realtime Database: Used for real-time messaging and chat history storage.

Make sure these dependencies are properly added to your project's `build.gradle` file.

## Contributing

Contributions to the Android Chatting App are welcome. If you find any bugs or have suggestions for improvements, please open an issue or submit a pull request.

## License

The Android Chatting App is licensed under the [MIT License](LICENSE).

## Acknowledgments

- The Android Chatting App is built using Kotlin and Firebase, leveraging the power of Firebase Authentication and Realtime Database.
- Thanks to the open-source community for their contributions and libraries used in this project.

## Contact

If you have any questions or suggestions, feel free to contact the project maintainer at aasifalee.114@gamil.com.
