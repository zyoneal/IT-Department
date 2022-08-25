package repository.impl;

import lombok.AllArgsConstructor;
import model.entity.Candidate;
import org.springframework.stereotype.Service;
import repository.CandidateRepository;
import service.CandidateService;

@Service(value = "candidateService")
@AllArgsConstructor
public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository candidateRepository;

    @Override
    public Candidate save(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

}
