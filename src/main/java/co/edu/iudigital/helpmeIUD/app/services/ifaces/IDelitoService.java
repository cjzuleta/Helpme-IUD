package co.edu.iudigital.helpmeIUD.app.services.ifaces;


import co.edu.iudigital.helpmeIUD.app.dtos.DelitoDTO;
import co.edu.iudigital.helpmeIUD.app.dtos.DelitoDTORequest;

import java.util.List;

public interface IDelitoService {

    List<DelitoDTO> getAll(); // TODO: Agregar excepciones personalizadas

    DelitoDTO save(DelitoDTORequest request); // TODO: Agregar excepciones personalizadas

    DelitoDTO getById(Long id); // TODO: Agregar excepciones personalizadas

    void deleteById(Long id);// TODO: Agregar excepciones personalizadas
}
