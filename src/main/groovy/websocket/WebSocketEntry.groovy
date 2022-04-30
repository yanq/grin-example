package websocket

import groovy.util.logging.Slf4j

import javax.websocket.*
import javax.websocket.server.ServerEndpoint

/**
 * websocket.WebSocketEntry
 * 入口，也作示例
 * 如果这个不适合，可以在项目初始化时，替换掉。
 */
@Slf4j
@ServerEndpoint("/ws")
class WebSocketEntry {
    @OnOpen
    public void onOpen(Session session) {
        log.info("Connected " + session.getId());
    }

    @OnMessage
    public String onMessage(String message, Session session) {
        log.info("收到 ${message}")
        return "ok"
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        log.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
    }
}
