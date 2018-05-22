package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.INFECTIOUS_DISEASE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.InfectiousDisease;

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
