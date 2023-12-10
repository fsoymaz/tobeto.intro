package rentacar.rentcar.services.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentacar.rentcar.dataaccess.PriceRepository;
import rentacar.rentcar.services.dtos.price.requests.AddPriceRequest;
import rentacar.rentcar.entities.Price;
import rentacar.rentcar.services.abstracts.PriceService;
import rentacar.rentcar.services.dtos.price.requests.UpdatePriceRequest;
import rentacar.rentcar.services.dtos.price.responses.GetListPriceResponse;

import java.math.BigDecimal;
import java.util.List;


@Service
public class PriceManager implements PriceService {

    @Autowired
    private final PriceRepository priceRepository;

    public PriceManager(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public void add(AddPriceRequest request) {
        Price price = new Price();
        price.setDailyRate(request.getDailyRate());
        price.setInsuranceFee(request.getInsuranceFee());
        priceRepository.save(price);
    }

    public void update(int priceId, UpdatePriceRequest request) {
        Price existingPrice = priceRepository.findById(priceId)
                .orElseThrow(() -> new RuntimeException("Güncellenecek fiyat bulunamadı .ID: " + priceId));
        existingPrice.setDailyRate(request.getDailyRate());
        existingPrice.setInsuranceFee(request.getInsuranceFee());
        priceRepository.save((existingPrice));
    }


    public void delete(int priceId) {

        // Markanın veritabanında var olup olmadığını kontrol et
        Price existingPrice = priceRepository.findById(priceId)
                .orElseThrow(() -> new RuntimeException("Silinecek araba fiyatı bulunamadı. ID: " + priceId));

        // Markayı sil
        priceRepository.delete(existingPrice);
    }

    @Override
    public Price getById(int priceId) {
        return priceRepository.findById(priceId).orElseThrow();
    }

    @Override
    public List<GetListPriceResponse> getAll() {
        return priceRepository.getAll();
    }

    @Override
    public List<GetListPriceResponse> getByDailyPrice(BigDecimal dailyPrice) {
        return priceRepository.findByPriceDailyRate(dailyPrice);
    }
}
