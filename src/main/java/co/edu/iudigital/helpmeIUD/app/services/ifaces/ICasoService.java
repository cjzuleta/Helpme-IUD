package co.edu.iudigital.helpmeIUD.app.services.ifaces;



import co.edu.iudigital.helpmeIUD.app.dtos.CasoDTO;

import java.util.List;

public interface ICasoService {

    List<CasoDTO> getAll(); // TODO: Agregar excepciones personalizadas

    CasoDTO save(CasoDTO caso); // TODO: Agregar excepciones personalizadas

    CasoDTO getById(Long id); // TODO: Agregar excepciones personalizadas
}
