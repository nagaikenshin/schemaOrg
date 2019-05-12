package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.EDUCATIONAL_OCCUPATIONAL_CREDENTIAL;
import org.kyojo.schemaorg.m3n5.pending.Clazz.EducationalOccupationalCredential;

@ExternalDomain
public class EducationalOccupationalCredentialConverter implements DomainConverter<EducationalOccupationalCredential, String> {

	@Override
	public String fromDomainToValue(EducationalOccupationalCredential domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationalOccupationalCredential fromValueToDomain(String value) {
		return new EDUCATIONAL_OCCUPATIONAL_CREDENTIAL(value);
	}

}
