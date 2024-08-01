package io.github.vatisteve.dataretriever.seatable.model;

import io.github.vatisteve.dataretriever.seatable.enums.STVersion;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class STConnectionInfo {
    private String url;
    private String apiKey;
    private STVersion version;
}
