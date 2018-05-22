package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROTEIN_CONTENT;
import org.kyojo.schemaOrg.m3n3.core.Container.ProteinContent;

@ExternalDomain
public class ProteinContentConverter implements DomainConverter<ProteinContent, String> {

	@Override
	public String fromDomainToValue(ProteinContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProteinContent fromValueToDomain(String value) {
		return new PROTEIN_CONTENT(value);
	}

}
