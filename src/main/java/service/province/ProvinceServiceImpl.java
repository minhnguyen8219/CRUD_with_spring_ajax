package service.province;

import model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IProvinceRepository;

public class ProvinceServiceImpl implements IProvinceService{

    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(int id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public Province update(Province model) {
        Province p = model;
        provinceRepository.save(model);
        return p;
    }

    @Override
    public Province save(Province model) {
        Province p = model;
        provinceRepository.save(model);
        return p;
    }

    @Override
    public Province remove(int id) {
        Province p = findById(id);
        provinceRepository.delete(id);
        return p;
    }
}
