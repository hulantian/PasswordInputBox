# PasswordInputBox
一个密码输入框控件<br>
<img src="https://github.com/hfdy/PasswordInputBox/blob/master/Screenshot/Screenshot_2017-06-26-09-00-01-467_PasswordInput.png" width = "360" height = "640" />
### 获取PasswordInputBox
- Gradle
Add it in your root build.gradle at the end of repositories:

    ```
    allprojects {
        repositories {
        	...
        	maven { url 'https://jitpack.io' }
        }
    }
    ```

  Add the dependency:

    ```
    dependencies {
        compile 'com.github.hfdy:PasswordInputBox:v1.0.0'
    }
    ```
- maven

    ```
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependency>
        <groupId>com.github.hfdy</groupId>
        <artifactId>PasswordInputBox</artifactId>
        <version>v1.0.0</version>
    </dependency>
    ```

### 使用PasswordInputBox
- Add the PasswordInputBox to your layout.

    ```
    <com.magic.pwdinputbox.PasswordInputBox
        android:id="@+id/pwdinputbox"
        android:layout_marginTop="80dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"

        app:pwdVisible="true"
        app:needCursor="true"
        app:pwdNum="8"
        app:borderColor="#303F9F"
        app:borderWidth="4dp"
        app:circleColor="#FF4081"
        app:circleSize="6dp"
        app:textColor="#FF4081"
        app:textSize="12dp"/>
    ```

- Add the PasswordInputBox Listener.

    ```
    pwdinputbox.setOnPwdInputListener(new PasswordInputBox.OnPwdInputListener() {
        @Override
        public void pwdChange(String pwd, PasswordInputBox.PwdInput flag) {

        }

        @Override
        public void pwdComplete(String pwd) {

        }
    });
    ```

- Clear the PasswordInputBox.

    ```
    pwdinputbox.clearPwd();
    ```

### 更新日志
- 1.0.0 2017/06/26