package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Event;
import com.example.pidev_finance.entities.ShareHolder;
import com.example.pidev_finance.repositories.IEventRepository;
import com.example.pidev_finance.repositories.IShareholderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShareHolderServiceImpl implements ShareHolderService {
    private IShareholderRepository Ishareholderrepository;
    private IEventRepository iEventRepository;
    @Override
    public List<ShareHolder> retrieveAllShareHolder()  {
        return Ishareholderrepository.findAll();
    }

    @Override
    public ShareHolder AddShareHolder(ShareHolder shareholder) {
        return Ishareholderrepository.save(shareholder);
    }

    @Override
    public void removeShareHolder(Integer numShareholder) {
        Ishareholderrepository.deleteById(numShareholder);
    }

    @Override
    public ShareHolder retrieveShareHolder(Integer numShareholder) {
        return Ishareholderrepository.findById(numShareholder).orElse(null);
    }

    @Override
    public ShareHolder updateShareHolder(ShareHolder shareholder) {
        return Ishareholderrepository.save(shareholder);
    }
    @Override
    public ShareHolder assignShareHolderToEvent(Integer idShareHolder, Integer idEvent){
        ShareHolder shareholder=Ishareholderrepository.findById(idShareHolder).orElse(null);
        Event event=iEventRepository.findById(idEvent).orElse(null);
        shareholder.setEvent(event);
        return Ishareholderrepository.save(shareholder);
    }
}
