package edu.tcu.cs.hogwartsartifactsonline.artifact;

import org.springframework.stereotype.Service;

@Service
public class ArtifactService {

    private final ArtifactRepository artifactRepository;

    public ArtifactService(ArtifactRepository artifactRepository) {
        this.artifactRepository = artifactRepository;
    }

    public Artifact findById(String artifactId) {
        return null;
    }
}
