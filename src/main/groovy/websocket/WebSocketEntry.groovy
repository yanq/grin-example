package websocket

import groovy.util.logging.Slf4j
import gun.web.HttpSessionConfigurator

import javax.servlet.http.HttpSession
import javax.websocket.*
import javax.websocket.server.ServerEndpoint

/**
 * websocket.WebSocketEntry
 * 入口，也作示例
 * 如果这个不适合，可以在项目初始化时，替换掉。
 * 客户端测试代码：let ws = new WebSocket('ws://localhost:8080/ws'); ws.send('hi')
 */
@Slf4j
@ServerEndpoint(value = "/ws", configurator = HttpSessionConfigurator)
class WebSocketEntry {
    @OnOpen
    public void onOpen(Session session, EndpointConfig config) {
        HttpSession httpSession = config.getUserProperties().get(HttpSession.name)
        session.getUserProperties().put(HttpSession.name, httpSession)
        log.info("Connected ${session.id} from ${httpSession.id}");
    }

    @OnMessage
    public String onMessage(String message, Session session) {
        HttpSession httpSession = session.getUserProperties().get(HttpSession.name)
        log.info("收到 ${message} and count ${httpSession.getAttribute('count')}")
        return "ok"
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        log.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
    }
}
