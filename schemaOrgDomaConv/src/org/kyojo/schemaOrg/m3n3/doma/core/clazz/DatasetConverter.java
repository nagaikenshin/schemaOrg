package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATASET;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Dataset;

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
