package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DDX_ELEMENT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DDxElement;

@ExternalDomain
public class DDxElementConverter implements DomainConverter<DDxElement, String> {

	@Override
	public String fromDomainToValue(DDxElement domain) {
		return domain.getNativeValue();
	}

	@Override
	public DDxElement fromValueToDomain(String value) {
		return new DDX_ELEMENT(value);
	}

}