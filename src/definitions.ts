export interface DeveloperOptionsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
