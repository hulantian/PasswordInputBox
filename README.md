# PasswordInputBox
An android password input box control.<br>
<br>
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

### 附录
- Layout of the property.

    属性 | 介绍
    :---:|:---:
    pwdVisible | 显示密码还是圆点，默认显示圆点
    needCursor | 是否显示光标，默认不显示
    pwdNum | 密码位数，默认6
    borderColor | 绘制的边框颜色
    borderWidth | 绘制的边框宽度
    circleColor | 显示圆点时圆点的颜色
    circleSize | 显示圆点时圆点的半径大小
    textColor | 显示密码时文本的颜色
    textSize | 显示密码时文本的大小

### 更新日志
- 1.0.0 2017/06/26