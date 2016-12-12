package com.wix.yuri.test.server

import com.wix.bootstrap.jetty.BootstrapServer
import org.springframework.context.annotation.Configuration

object Server extends BootstrapServer {
  override def additionalSpringConfig = Some(classOf[ServerWiring])
}

@Configuration
class ServerWiring {

}
