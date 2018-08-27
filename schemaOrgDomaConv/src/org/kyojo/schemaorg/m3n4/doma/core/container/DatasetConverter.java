package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DATASET;
import org.kyojo.schemaorg.m3n4.core.Container.Dataset;

@ExternalDomain
public class DatasetConverter implements DomainConverter<Dataset, String> {

	@Override
	public String fromDomainToValue(Dataset domain) {
		return domain.getNativeValue();
	}

	@Override
	public Dataset fromValueToDomain(String value) {
		return new DATASET(value);
	}

}
