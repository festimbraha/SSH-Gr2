package Client.components;

import Client.controllers.StudentController;
import Client.controllers.partials.ChatUserController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

public class ChatUserComponent {

    public StudentController studentController;
    public String picturePath;
    public String studentName;
    public int studentId;

    public ChatUserComponent() {
    }

    public Node getContent() throws Exception{
        return getContent(null);
    }

    public Node getContent(EventHandler<ActionEvent> clickHandler) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../views/partials/chat-user.fxml"));

        Node node = loader.load();

        ChatUserController controller = loader.<ChatUserController>getController();
        controller.initData(picturePath, studentName, studentController);

        return node;
    }
}
