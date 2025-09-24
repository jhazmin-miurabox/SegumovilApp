# Windows build troubleshooting for the jlink failure

If the Gradle sync still fails on Windows with the `core-for-system-modules.jar` jlink error after pulling the change that sets
`android.experimental.jdkImageTransformOptions=useFullJdk`, follow the steps below to make sure Android Studio actually uses the
updated setting and clears the cached transform artifacts:

1. **Close Android Studio** to stop any Gradle daemons that were started before the property was added.
2. **Terminate old Gradle daemons** from a terminal by running:
   ```powershell
   gradlew --stop
   ```
   You can also run the command in Git Bash or Windows Terminal from the project root. Stopping the daemons ensures the new
   property is picked up the next time Gradle starts.
3. **Remove the cached jlink output** that can keep triggering the failure even after the property is present. Delete the
   directory:
   ```
   %USERPROFILE%\.gradle\caches\transforms-3
   ```
   This forces Gradle to skip the stale transform result on the next build.
4. **Re-open Android Studio**, then choose **File ▸ Sync Project with Gradle Files**.
5. Once the sync finishes, run **Build ▸ Clean Project** and then try building again.
6. If the error still appears, open **File ▸ Settings ▸ Build, Execution, Deployment ▸ Build Tools ▸ Gradle** and make sure the
   *Gradle JDK* is set to the bundled "Android Studio JDK" (the one that lives under `C:\Program Files\Android\Android Studio\jbr`).
   Using a custom JDK that does not contain the full module set can cause the jlink task to fail.

Following these steps should refresh the environment so that Gradle uses the untrimmed JDK instead of attempting (and failing) to
create a trimmed image.
