package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.INFECTIOUS_DISEASE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.InfectiousDisease;

@ExternalDomain
public class InfectiousDiseaseConverter implements DomainConverter<InfectiousDisease, String> {

	@Override
	public String fromDomainToValue(InfectiousDisease domain) {
		return domain.getNativeValue();
	}

	@Override
	public InfectiousDisease fromValueToDomain(String value) {
		return new INFECTIOUS_DISEASE(value);
	}

}
