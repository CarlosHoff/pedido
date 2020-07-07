package br.com.hoffmann.pedido.client.notificacao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "${notification.client}", name = "NotificationClient")
public interface NotificationClient {

    @RequestMapping(value = "/enviaEmailSemAnexo", method = RequestMethod.POST)
    void enviaEmailSemAnexo(@Param(value = "usuarioID") Long usuarioID);

    @RequestMapping(value = "/enviaEmailComAnexo", method = RequestMethod.POST)
    void enviaEmailComAnexo(@Param(value = "usuarioID") Long usuarioID,
                            @Param(value = "nomeAnexo") String nomeAnexo);
}
