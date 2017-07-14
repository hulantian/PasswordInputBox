# PasswordInputBox
An android password input box control.<br>
<br>
<img src="https://github.com/hfdy/PasswordInputBox/blob/master/Screenshot/Screenshot1.png" width = "360" height = "640" />
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
        compile 'com.github.hfdy:PasswordInputBox:v1.1.0'
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
        <version>v1.1.0</version>
    </dependency>
    ```

### 使用PasswordInputBox
1. Add the PasswordInputBox to your layout.
    1. 使用系统键盘
        ```
        <com.magic.pwdinputbox.PasswordInputBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:isCustomKeyboard="false"/>
        ```

    2. 使用自定义键盘(需要添加键盘控件并且调用注册方法)
    - 添加控件
        ```
        <com.magic.pwdinputbox.PasswordInputBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"/>
        ```
        ```
        <com.magic.pwdinputbox.MagicKeyBoard
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:randomKeyBoard="true"/>
        ```
    - 注册方法
        ```
        pwdInputBox.register(magicKeyBoard);
        ```


2. Add the PasswordInputBox Listener.

    ```
    pwdInputBox.setOnPwdInputListener(new PasswordInputBox.OnPwdInputListener() {
        @Override
        public void pwdChange(String pwd, PasswordInputBox.PwdInput flag) {

        }

        @Override
        public void pwdComplete(String pwd) {

        }
    });
    ```

3. Clear the PasswordInputBox.

    ```
    pwdInputBox.clearPwd();
    ```
4. Other Settings.
- PasswordInputBox

    ```
    <com.magic.pwdinputbox.PasswordInputBox
        android:id="@+id/pwdinputbox"
        android:layout_marginTop="80dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"

        app:isCustomKeyboard="false"
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

- MagicKeyBoard

    ```
    <com.magic.pwdinputbox.MagicKeyBoard
        android:id="@+id/magickeyboard"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"

        app:randomKeyBoard="true"
        app:lineWidth="2dp"
        app:lineColor="#ff0000"
        app:numbersSize="15dp"
        app:numbersColor="#00ff00"
        app:numbersNormalBgColor="#ffff00"
        app:numbersPressBgColor="#00ffff"
        app:deleteNormalBgColor="#0000ff"
        app:deletePressBgColor="#ff00ff"/>
    ```


### 附录
- PasswordInputBox

    | 属性             | 介绍               | 默认 |
    | :---------------:|:------------------:|:--:|
    | isCustomKeyboard | 是否使用自定义键盘 | 是 |
    | pwdVisible | 显示密码还是圆点 | 显示圆点 |
    | needCursor | 是否显示光标 | 不显示 |
    | pwdNum | 密码位数 | 6位 |
    | borderColor | 绘制的边框颜色 | &nbsp; |
    | borderWidth | 绘制的边框宽度 | &nbsp; |
    | circleColor | 显示圆点时圆点的颜色 | &nbsp; |
    | circleSize | 显示圆点时圆点的半径大小 | &nbsp; |
    | textColor | 显示密码时文本的颜色 | &nbsp; |
    | textSize | 显示密码时文本的大小 | &nbsp; |

- MagicKeyBoard

    | 属性             | 介绍               | 默认 |
    | :---------------:|:------------------:|:--:|
    | randomKeyBoard | 是否开启随机键盘 | 否 |
    | lineWidth | 线条的宽度 | 1dp |
    | lineColor | 线条的颜色 | &nbsp; |
    | numbersSize | 数字的大小 | 6位 |
    | numbersColor | 数字的颜色 | &nbsp; |
    | numbersNormalBgColor | 数字正常状态的背景颜色 | &nbsp; |
    | numbersPressBgColor | 数字按压状态的背景颜色 | &nbsp; |
    | deleteNormalBgColor | 删除按键正常状态的背景颜色 | &nbsp; |
    | deletePressBgColor | 删除按键按压状态的背景颜色 | &nbsp; |

### 更新日志
- 1.0.0 2017/06/26         具有和系统键盘交互的功能，暂不支持自定义键盘
- 1.1.0 2017/07/14 增加了对自定义键盘的支持