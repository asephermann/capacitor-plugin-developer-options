import { WebPlugin } from '@capacitor/core';

import type { DeveloperOptionsPlugin } from './definitions';

export class DeveloperOptionsWeb extends WebPlugin implements DeveloperOptionsPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
