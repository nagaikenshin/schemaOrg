package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ISWC_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.IswcCode;

@ExternalDomain
public class IswcCodeConverter implements DomainConverter<IswcCode, String> {

	@Override
	public String fromDomainToValue(IswcCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public IswcCode fromValueToDomain(String value) {
		return new ISWC_CODE(value);
	}

}
